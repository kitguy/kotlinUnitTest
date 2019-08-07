import org.junit.Test

import com.nhaarman.mockito_kotlin.*
import org.junit.Before

class StatusServiceTest {

    lateinit var service: StatusService
    lateinit var testRepoMock: TestRepository

    lateinit var negativeServiceMock: NegativeService

    @Before
    fun setUp() {
        testRepoMock = mock {}
        negativeServiceMock = mock {}
        service = StatusService(testRepoMock, negativeServiceMock)
    }

    @Test
    fun `"savePositivesHandleNegatives" saves in repository if positive number`() {
        testRepoMock.stub { on { getInteger() } doReturn 1 }

        service.savePositivesHandleNegatives()

        verify(testRepoMock).saveInt(eq(1))
    }

    @Test
    fun `"savePositivesHandleNegatives" delegates to negativeService if negative number`() {
    }

    @Test(expected = CannotBeZeroException::class)
    fun `"savePositivesHandleNegatives" throws CannotBeZeroException if zero`() {
        testRepoMock.stub {
            on { getInteger() } doReturn 0
        }

        service.savePositivesHandleNegatives()
    }

    @Test
    fun  `"savePositivesHandleNegativeList" handles negative if at least one negative on list`() {
    }

    @Test
    fun  `"savePositivesHandleNegativeList" saves positive list on db if all of them are higher than zero`() {
    }


}