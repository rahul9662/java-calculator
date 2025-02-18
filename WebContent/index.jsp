<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculator</title>
</head>
<body>
    <h1>Simple Calculator</h1>
    <form action="calculator" method="get">
        <input type="number" name="num1" placeholder="Number 1" required />
        <input type="number" name="num2" placeholder="Number 2" required />
        
        <select name="operator" required>
            <option value="+">+</option>
            <option value="-">-</option>
            <option value="*">*</option>
            <option value="/">/</option>
        </select>
        
        <button type="submit">Calculate</button>
    </form>

    <h3>Result:</h3>
    <p>
        <strong>
            <% 
                Double result = (Double) request.getAttribute("result");
                if (result != null) {
                    out.print(result);
                } else {
                    out.print("Invalid input or error");
                }
            %>
        </strong>
    </p>
</body>
</html>
