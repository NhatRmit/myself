//Attribute
const button = document.querySelector('button')
const heading = document.querySelector('.heading')
const heading_content = document.createElement('span')
const announcement = document.querySelector('.announcement')
const announcement_content = document.createElement('span')
const msg = document.querySelector('#msg')
const msg_content = document.querySelector('.msg_content')
const msg_print = document.createElement('span')


//Functions
function showInput() {
    msg_print.textContent = msg.value
    msg_content.appendChild(msg_print)
}


//Call
//Heading
heading_content.textContent = "Send Your Mess To The Show!"
heading.appendChild(heading_content)
//message section
announcement_content.textContent = "Below is your messages."
announcement.appendChild(announcement_content)

button.addEventListener("click", showInput)
