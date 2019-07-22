import TestState.NumberEnum

class StatusService(private val testRepository: TestRepository, private val negativoService: NegativeService) {


    fun savePositivesHandleNegatives() {
        val myInt: Int = testRepository.getInteger()

        if (myInt > 0) {
            testRepository.saveInt(myInt)
        } else if (myInt == 0) {
            throw CannotBeZeroException("Cannot be zero")
        } else {
            negativoService.handleNegative(myInt)
        }
    }

    fun savePositivesHandleNegativesList() {
        if (testRepository.getIntegerList().any { i -> i < 0 }) {
            val negativeList = testRepository.getIntegerList().filter { i: Int -> i < 0 }
            negativoService.handleNegatives(negativeList)
        } else {
            val positives = testRepository.getIntegerList().filter { i: Int -> i > 0 }
            if (positives.isEmpty()) {
                return
            }
            testRepository.savePositives(positives)
        }
    }

    fun numberToState(): NumberEnum? {
    //TODO("Implement with TDD")
    // TODO("Should return NEGATIVE enum if number is low than 0 and POSITIVE if higher than 0")
        return null
    }
}

class CannotBeZeroException(message: String) : Throwable()
