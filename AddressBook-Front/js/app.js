const loader = document.getElementById('loader');
const notif = document.getElementById('notif');
const url = "http://localhost:8082/AddressBook/loading/";

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
            console.table(client);
            console.log("Adresses Loaded");
            notif.removeChild(loadingSpinner);
            notif.append(successMsg);
            notif.classList.add("is-success");
            notif.append(closeBtn);

        }
        
        else {
            console.error(data);
            console.log("message: " + client.status);
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


(document.querySelectorAll('.notification .delete') || []).forEach(($delete) => {
  $notification = $delete.parentNode;
  $delete.addEventListener('click', () => {
    console.log('hello boy');
    $notification.parentNode.removeChild($notification);
  });
});


