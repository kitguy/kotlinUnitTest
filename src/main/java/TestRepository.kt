open class TestRepository {

    open fun getIntegerList(): Collection<Int> {
        return mutableListOf(1, 5, -1, -10323)
    }

    open fun getInteger(): Int {
        return (-10..10).shuffled().first()
    }

    open fun savePositives(positives: List<Int>) {
    }

    open fun saveInt(myInt: Int) {
    }
}