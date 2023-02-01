fun main(){
    var inputNumber = 0f

    var isInputValid: Boolean = false

    while (!isInputValid){
        print("Please enter a number:")
        val stringInput = readLine()
        try {
            inputNumber = stringInput!!.toFloat()
            isInputValid = true
        }catch (e: NumberFormatException){
            println("Please enter a valid data to convert.")
        }
    }

    print("Enter unit of measurement:")
    var unitOfMeasurement = readLine()

    var inputData = "$inputNumber$unitOfMeasurement"

    var result: String

    when (unitOfMeasurement){
        "km" -> result = "$inputData =  ${inputNumber * 0.62}mi"
        "mi" -> result = "$inputData = ${inputNumber * 1.61}km"
        "cm" -> result = "$inputData = ${inputNumber * 0.39}in"
        "in" -> result = "$inputData = ${inputNumber * 2.54}cm"
        "kg" -> result = "$inputData = ${inputNumber * 2.2}lb"
        "lb" -> result = "$inputData =  ${inputNumber * 0.45}kg"
        "g" -> result = "$inputData =  ${inputNumber * 0.04}oz"
        "oz" -> result = "$inputData =  ${inputNumber * 28.35}g"

        "C" -> result = "$inputData =  ${(inputNumber * (9/5))+32}F"
        "L" -> result = "$inputData =  ${inputNumber * 4.17}cups"
        "cup" -> result = "$inputData =  ${inputNumber * 0.24}L"
        else -> result = "$unitOfMeasurement cannot be converted."
    }

    println(result)
}