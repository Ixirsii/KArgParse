package tech.ixirsii.argParse

/**
 *
 */
interface DataTransform<T> {
    /**
     * Transform a [String] into a [T].
     *
     * @param arg String argument to transform.
     * @return an instance of [T].
     */
    fun transform(arg: String): T
}