document.addEventListener('DOMContentLoaded', function () {
    const generateInsultButton = document.getElementById('generateInsult');
    const insultTextElement = document.getElementById('insultText');

    generateInsultButton.addEventListener('click', function () {
        fetch('/getInsult')
            .then(response => response.json())
            .then(data => {
                insultTextElement.textContent = data.insultText;
            })
            .catch(error => {
                console.error('Fejl ved anmodning om fornærmelse:', error);
            });
    });
});
