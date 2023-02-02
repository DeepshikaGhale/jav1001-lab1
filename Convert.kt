fun main(){
    //collect valid input number from getInputNumber function
    val inputNumber = getInputNumber()

    print("Enter unit of measurement:")
    //collect unit of measurement for conversion
    val unitOfMeasurement = readLine()

    //collect the final result after validating the input data
    val result: String = validateMeasurementUnit(inputNumber, unitOfMeasurement!!)

    //provide output
    println(result)
}

//validate measurement unit
fun validateMeasurementUnit(inputNumber: Float, unitOfMeasurement: String): String{
    //store the result from convertMeasurementUnit function
    var result: String = convertMeasurementUnit(inputNumber, unitOfMeasurement)

    /*
     in case the measurement unit is not found then while loop
     runs to ask user to enter the measurement unit again
    */
    while (result == "not found"){

        println("The provided measurement unit is not found.")
        print("Enter unit of measurement:")
        //collect the measurement unit
        val validMeasurementUnit = readLine()
        result =  convertMeasurementUnit(inputNumber, validMeasurementUnit!!)
    }

    return result
}

//logic for conversion
fun convertMeasurementUnit(inputNumber: Float, unitOfMeasurement: String): String{

    //collect conversion number and unit
    val inputData= "$inputNumber$unitOfMeasurement"

    //collect result
    val conversionResult: String

    /*
     use of when statement for conversion, similar to switch, when any condition satisfies the entered
     unit of measurement then it converts it to respective unit otherwise it enters the else statement
    */

    when (unitOfMeasurement){
        "km" -> conversionResult = "$inputData =  ${inputNumber * 0.62}mi"
        "mi" -> conversionResult = "$inputData = ${inputNumber * 1.61}km"
        "cm" -> conversionResult = "$inputData = ${inputNumber * 0.39}in"
        "in" -> conversionResult = "$inputData = ${inputNumber * 2.54}cm"
        "kg" -> conversionResult = "$inputData = ${inputNumber * 2.2}lb"
        "lb" -> conversionResult = "$inputData =  ${inputNumber * 0.45}kg"
        "g" -> conversionResult = "$inputData =  ${inputNumber * 0.04}oz"
        "oz" -> conversionResult = "$inputData =  ${inputNumber * 28.35}g"
        "C" -> conversionResult = "$inputData =  ${(inputNumber * (9.0/5))+32}F"
        "L" -> conversionResult = "$inputData =  ${inputNumber * 4.17}cups"
        "cup" -> conversionResult = "$inputData =  ${inputNumber * 0.24}L"
        else -> conversionResult = "not found" //return not found if the measurement unit is not available
    }
    return conversionResult
}


//get input number
fun getInputNumber(): Float {
    //collect the input number
    var input = 0f

    //validate if the input number or not
    var isInputValid = false

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



