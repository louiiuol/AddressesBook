const loader = document.getElementById('loader');
const notif = document.getElementById('notif');
const url = "http://localhost:8082/AddressBook/loading/";

const loadingSpinner = document.createElement("i");
loadingSpinner.classList.add("fas", "fa-spinner", "fa-pulse");
const successMsg = "Les addresses ont bien été chargé depuis le csv.";
const errorMsg = "Un problème est survenu dans le serveur, contacter l'administrateur.";


notif.hidden = true;

loader.onclick = () => {
    client = new XMLHttpRequest();
    notif.append(loadingSpinner);
    notif.hidden = false;
    client.onload = function (data) {
    
        if (client.readyState == 4 && client.status == "200") {
            console.table(client);
            console.log("Adresses Loaded");
            notif.innerText = successMsg;
            notif.classList.add("is-success");
            
            //Append to field
            //<p class="help is-success">This username is available</p>
            //  <p class="help is-danger">This email is invalid</p>
            // <span class="icon is-small is-left"><i class="fas fa-envelope"></i></span>
        }
        
        else {
            console.error(data);
            notif.innerText = errorMsg ;
            notif.classList.add("is-danger");
             // Append to field
        //  <p class="help is-danger">This email is invalid</p>
        // <span class="icon is-small is-left"><i class="fas fa-envelope"></i></span>
        }
      }
    
    client.open('GET', url, true);
    client.setRequestHeader('Content-type','charset=utf-8');

    client.send(); 
};





document.addEventListener('DOMContentLoaded', () => {
    (document.querySelectorAll('.notification .delete') || []).forEach(($delete) => {
      $notification = $delete.parentNode;
      $delete.addEventListener('click', () => {
        $notification.parentNode.removeChild($notification);
      });
    });
  });