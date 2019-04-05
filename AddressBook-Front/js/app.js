const loader = document.getElementById('loader');
const notif = document.getElementById('notif');
const url = "http://localhost:8082/AddressBook/loading/";

let loadingSpinner = document.createElement("i");
loadingSpinner.classList.add("fas", "fa-spinner", "fa-pulse");
let successMsg =  document.createElement("span");
successMsg.innerText = "Les addresses ont bien été chargé depuis le csv.";
let errorMsg = document.createElement("span");
errorMsg.innerText = "Un problème est survenu dans le serveur, contacter l'administrateur.";
let deleteBtn = document.createElement("button");
deleteBtn.classList.add("delete");


notif.hidden = true;

loader.onclick = () => {
    client = new XMLHttpRequest();
    notif.append(loadingSpinner);
    loader.classList.add("hidden")
    notif.hidden = false;
    client.onload = function (data) {
    
        if (client.readyState == 4 && client.status == "200") {
            console.table(client);
            console.log("message: " + client.statusText);
            console.log("Adresses Loaded");
            
            notif.removeChild(loadingSpinner);
            notif.append(successMsg);
            notif.classList.add("is-success");
            notif.append(deleteBtn);

            
           
        }
        
        else {
            console.error(data);
            notif.append(errorMsg);
            notif.classList.add("is-danger");
            notif.append(deleteBtn);
             
        }
      }
    
    client.open('GET', url, true);
    client.setRequestHeader('Content-type','charset=utf-8');

    client.send(); 

    (document.querySelectorAll('.notification .delete') || []).forEach(($delete) => {
      $notification = $delete.parentNode;
      $delete.addEventListener('click', () => {
        $notification.parentNode.removeChild($notification);
      });
    });
};



