const items = document.querySelectorAll('.opt-itm');
const button = document.querySelectorAll('.opt-btn');

window.addEventListener('DOMContentLoaded', () => {
    button[0].classList.add('active-btn');
});

function resetActiveBtn() {
    button.forEach((btn) => {
        btn.classList.remove('active-btn');
    });
}

function showFilteredContent(btn) {
    items.forEach((item) => {
        if (item.classList.contains(btn.id)) {
            resetActiveBtn();
            btn.classList.add('active-btn');
            item.style.display = "block";
        } else {
            item.style.display = "none";
        }
    });
}

button.forEach((btn) => {
    btn.addEventListener('click', () => {
        showFilteredContent(btn);
    });
});
