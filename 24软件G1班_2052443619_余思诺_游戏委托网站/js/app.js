const btn = document.querySelector(".btn");
const park_sec = document.querySelectorAll(".park-sec");

var sendFalg = 0;

btn.addEventListener("click", function () {
    this.classList.toggle("active");

    if (sendFalg === 0) {
        sendFalg = 1;
        this.textContent = "收起";
        park_sec.forEach(function (item) {
            item.classList.add("active");
        });
    }
    else {
        sendFalg = 0;
        this.textContent = "展开";
        park_sec.forEach(function (item) {
            item.classList.remove("active");
        });
    }
    
});

