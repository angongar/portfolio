document.addEventListener("DOMContentLoaded", function () {
    const spinner = document.getElementById("spinner-loading");

    document.querySelectorAll("form").forEach(form => {
        form.addEventListener("submit", function () {
            spinner.style.display = "flex";
        });
    });

    document.querySelectorAll(".link-spinner").forEach(el => {
        el.addEventListener("click", function () {
            const isAnchor = el.tagName.toLowerCase() === "a";
            const href = el.getAttribute("href");

            if (isAnchor && href && href !== "#" && !href.startsWith("javascript:")) {
                spinner.style.display = "flex";
            }
        });
    });
});
