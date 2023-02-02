fun main(){

    var inputNumber = getInputNumber()

    print("Enter unit of measurement:")
    var unitOfMeasurement = readLine()


    var result: String = convertMeasurementUnit(inputNumber, unitOfMeasurement!!)

    println(result)
}

//logic for conversion
fun convertMeasurementUnit(inputNumber: Float, unitOfMeasurement: String): String{

    //collect conversion number and unit
    var inputData: String = "$inputNumber$unitOfMeasurement"

    //collect result
    var result: String

    /*
     use of when statement for conversion, similar to switch, when any condition satisfies the entered
     unit of measurement then it converts it to respective unit otherwise it enters the else statement
    */
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
    return result
}


//get input number
fun getInputNumber(): Float {
    //collect the input number
    var input = 0f

    //validate if the input if number or not
    var isInputValid: Boolean = false

    //loop runs until the input is valid
    while (!isInputValid) {
        print("Please enter a number:")
        val stringInput = readLine() //get input from user
        //handle exception
        try {
            //convert input to float
            input = stringInput!!.toFloat()
            isInputValid = true //validate the input
        } catch (e: NumberFormatException) {
            //prints in case of exception
            println("Please enter a valid data to convert.")
        }
    }
    return input
}



