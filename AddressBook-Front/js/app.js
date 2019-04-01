const loader = document.getElementById('loader');
const notif = document.getElementById('notif');
const url = "http://localhost:8082/addressBook/loading/";
loader.onclick = () => {
    client = new XMLHttpRequest();
    client.onload = function (data) {

        if (client.readyState == 4 && client.status == "200") {
            console.table(client);
            console.log("Adresses Loaded");
            //Append to field
            //<p class="help is-success">This username is available</p>
            //  <p class="help is-danger">This email is invalid</p>
            // <span class="icon is-small is-left"><i class="fas fa-envelope"></i></span>
        }
        
        else {
            console.error(data);
             // Append to field
        //  <p class="help is-danger">This email is invalid</p>
        // <span class="icon is-small is-left"><i class="fas fa-envelope"></i></span>
        }
      }
    
    client.open('GET', url, true);
    client.setRequestHeader('Content-type','charset=utf-8');

    client.send(); 
};
notif.hidden = true;
notif.innerText = "toto";
notif.hidden = false;


document.addEventListener('DOMContentLoaded', () => {
    (document.querySelectorAll('.notification .delete') || []).forEach(($delete) => {
      $notification = $delete.parentNode;
      $delete.addEventListener('click', () => {
        $notification.parentNode.removeChild($notification);
      });
    });
  });