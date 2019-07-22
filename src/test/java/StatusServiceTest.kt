import org.junit.Test

import com.nhaarman.mockito_kotlin.*
import org.junit.Before

class StatusServiceTest {

    private lateinit var service: StatusService
    private lateinit var testRepoMock: TestRepository

    private lateinit var negativeServiceMock: NegativeService

    @Before
    fun setUp() {
        testRepoMock = mock {}
        negativeServiceMock = mock {}
        service = StatusService(testRepoMock, negativeServiceMock)
    }

    @Test
    fun `"savePositivesHandleNegatives" `() {
    }

    @Test
    fun  `"savePositivesHandleNegativeList" handles negative if at least one negative on list`() {
    }

    @Test
    fun  `"savePositivesHandleNegativeList" saves positive list on db if all of them are higher than zero`() {
    }


}