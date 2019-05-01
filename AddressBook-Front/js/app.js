const loader = document.getElementById('loader');
const notif = document.getElementById('notif');
const url = "http://localhost:8082/Cities/loading/";
const spin = document.getElementById('spin');
const url_post = "http://localhost:8082/Addresses/";
const postAddress = document.getElementById('postAddress');

let successMsgPost =  document.createElement("span");
  successMsgPost.innerText = "L'adresse a bien été créé.";

let loadingSpinner = document.getElementsByClassName("fa-spinner");

let successMsg =  document.createElement("span");
  successMsg.innerText = "Les addresses ont bien été chargé depuis le csv.";

let errorMsg = document.createElement("span");

let closeBtn = document.getElementsByClassName('delete');

notif.hidden = loadingSpinner.hidden = true;

loader.onclick = () => {
    client = new XMLHttpRequest();
    loader.classList.add("hidden");
    notif.hidden = loadingSpinner.hidden = false;
    client.onload = function (data) {
    
        if (client.readyState == 4 && client.status == "200") {
            notif.removeChild(loadingSpinner);
            notif.append(successMsg);
            notif.classList.add("is-success");
            notif.append(closeBtn);
        } else {
            errorMsg.innerText = "Error N°" + client.status + ": " + client.responseText;
            notif.append(errorMsg);
            notif.classList.add("is-danger");
            notif.append(deleteBtn);
        }
      }
    
    client.open('GET', url, true);
    client.setRequestHeader('Content-type','charset=utf-8');

    client.send(); 

    
};

postAddress.onclick =() => {
  client = new XMLHttpRequest();
  
  client.open('POST', url_post, true);
  client.setRequestHeader('Content-type','charset=utf-8');
  client.send();

  client.onload = function (data) {
    if (client.readyState == 4 && client.status == "201") {
      console.table(client);
      console.log("Adresses posted");
      spin.removeChild(loadingSpinner);
      spin.append(successMsgPost);
      spin.classList.add("is-success");
      spin.append(closeBtn);
 }
  else {
      console.error(data);
      console.log("message: " + client.status);
      errorMsg.innerText = "Error N°" + client.status + ": " + client.responseText;
      spin.append(errorMsg);
      spin.classList.add("is-danger");
      spin.append(deleteBtn);
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





