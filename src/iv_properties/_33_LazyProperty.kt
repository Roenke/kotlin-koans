package iv_properties

import util.TODO

class LazyProperty(val initializer: () -> Int) {
    private var lazyValue: Int = 0
    private var isInitialized: Boolean = false
    val lazy: Int
        get() {
            if(!isInitialized) {
                isInitialized = true
                lazyValue = initializer()
            }

            return lazyValue
        }
}

fun todoTask33(): Nothing = TODO(
    """
        Task 33.
        Add a custom getter to make the 'lazy' val really lazy.
        It should be initialized by the invocation of 'initializer()'
        at the moment of the first access.
        You can add as many additional properties as you need.
        Do not use delegated properties!
    """,
    references = { LazyProperty({ 42 }).lazy }
)
