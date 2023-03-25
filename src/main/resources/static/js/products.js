const items = document.querySelectorAll('.product');
const button = document.querySelectorAll('.opt-btn');
const itemsCopy = Array.from(items);

window.addEventListener('DOMContentLoaded', () => {
    button[0].classList.add('active-btn');
});

function resetActiveBtn() {
    button.forEach((btn) => {
        btn.classList.remove('active-btn');
    });
}

function showFilteredContent(btn) {
    const itemsToShow = [];
    itemsCopy.forEach((item) => {
        if (item.classList.contains(btn.id)) {
            itemsToShow.push(item);
        }
    });

    items.forEach((item) => {
        if (itemsToShow.includes(item)) {
            item.style.display = 'block';
        } else {
            item.style.display = 'none';
        }

        if (item.parentNode) {
            item.parentNode.removeChild(item);
        }
    });

    const parent = document.querySelector('.products-list-opt');
    itemsToShow.forEach((item) => {
        parent.appendChild(item);
    });

    resetActiveBtn();
    btn.classList.add('active-btn');
}

button.forEach((btn) => {
    btn.addEventListener('click', () => {
        showFilteredContent(btn);
    });
});

