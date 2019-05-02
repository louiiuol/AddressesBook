const loader = document.getElementById('loader');
const notif = document.querySelector('#notif');

let url = "http://localhost:8082/";
const postAddress = document.getElementById('postAddress');

let successMsgPost =  document.createElement("span");
  successMsgPost.innerText = "L'adresse a bien été créé.";

let loadingSpinner = document.getElementById("spinner");

let successMsg =  document.createElement("span");
  successMsg.innerText = "Les addresses ont bien été chargé depuis le csv.";

let errorMsg = document.createElement("span");

let closeBtn = document.getElementById('delete');

notif.hidden = true;

function load() {
  client = new XMLHttpRequest();
    loader.classList.add('hidden');
    notif.hidden = false;
    notif.removeChild(closeBtn);
    notif.appendChild(loadingSpinner);
  url += "Cities/loading";
  client.open('POST', url, true);
  client.setRequestHeader('Content-type','charset=utf-8');
  client.send();
  

  client.onchanges = function (data) {
  
    if (client.readyState == 4 && client.status == "200") {
        notif.removeChild(loadingSpinner);
        notif.append(successMsg);
        notif.classList.add("is-success");
        notif.append(closeBtn);
    } else {
        notif.removeChild(loadingSpinner);
        errorMsg.innerText = "Error N°" + client.status + ": " + client.responseText;
        notif.append(errorMsg);
        notif.classList.add("is-danger");
        notif.append(closeBtn);
    }
  }
};

zipCode = document.getElementById('zipCode');
zipCode.onkeyup = findCitiesByZipCode();

function findCitiesByZipCode() {
  console.log(zipCode.value)
}
function createAddress() {
  
  console.log("hello");
  addressee = document.getElementById("addressee").value;
  street = document.getElementById("street").value;
  cityId = document.getElementById("cityId").value;
  isProfessional = document.getElementById("isProfessional").value;
  let json = JSON.stringify({
    "addressee": addressee,
    "street": street, 
    "cityId": cityId, 
    "isProfessional": isProfessional
  });
  client = new XMLHttpRequest();
  url += "Addresses/";
  client.open('POST', url, true);
  client.setRequestHeader('Content-type','application/json; charset=utf-8');
  client.send(json);
  console.log(json);
  client.onload = function (data) {
    if (client.readyState == 4 && client.status == "200") {
      console.table(client);
      console.log("Address posted");
      notif.removeChild(loadingSpinner);
      notif.append(successMsgPost);
      notif.classList.add("is-success");
      notif.append(closeBtn);
 }
  else {
      console.error(data);
      console.log("message: " + client.status);
      errorMsg.innerText = "Error N°" + client.status + ": " + client.responseText;
      notif.append(errorMsg);
      notif.classList.add("is-danger");
      notif.append(closeBtn);
    }
  }
}

(document.querySelectorAll('.notification .delete') || []).forEach(($delete) => {
  $notification = $delete.parentNode;
  $delete.addEventListener('click', () => {
    console.log('hello boy');
    $notification.parentNode.removeChild($notification);
  });
});
