package zk

import org.zkoss.zkgrails.*

class Issue142Composer extends GrailsComposer {

    def issue142Comet
    def lblTest
    
    def onClick_btnStart() {
        issue142Comet.start()
    }

    def onClick_btnStop() {
        issue142Comet.stop()
    }    
}