document.getElementById("balance-btn").addEventListener("click", function () {
    var equationInput = document.getElementById("equation-input").value;
    var balancedEquation = balanceChemicalEquation(equationInput);
    document.getElementById("balanced-equation").textContent = balancedEquation;
});

function balanceChemicalEquation(equation) {
    // Your balancing logic goes here
    // Implement the algorithm to balance the chemical equation

    // For demonstration purposes, let's return a placeholder result
    return "2 H2 + O2 -> 2 H2O";
}
