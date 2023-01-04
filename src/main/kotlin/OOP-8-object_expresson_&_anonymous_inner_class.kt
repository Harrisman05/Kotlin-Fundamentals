/*
    Object expression / anonymous inner class allows you to override an interface/
    abstract class directly using an expression. This saves creating another class to
    override the functions.
 */
interface DownloadListener {

    fun onDownloadStarted()
    fun onDownloadCompleted(file: String)
    fun onProgressUpdate(progress: Int)

}
class Downloader {

    var downloadListener: DownloadListener? = null

    fun downloadFile(file: String) {
        downloadListener?.onDownloadStarted()
        for (i in 1..10) {
            Thread.sleep(600)
            downloadListener?.onProgressUpdate(i * 10)
        }
        downloadListener?.onDownloadCompleted(file)
    }

}



fun main() {

    val downloader = Downloader()
    downloader.downloadListener = object : DownloadListener {

        override fun onDownloadStarted() {
            println("Download Started...")
        }

        override fun onDownloadCompleted(file: String) {
            println("$file downloaded.")
        }

        override fun onProgressUpdate(progress: Int) {
            println("$progress% Downloaded")
        }
    }

    downloader.downloadFile("FileA.mov")

}
