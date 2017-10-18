package testutils

import org.mockito.Mockito.`when`
import org.mockito.stubbing.OngoingStubbing

fun <T> whenever(x: T): OngoingStubbing<T> {
    return `when`(x)
}