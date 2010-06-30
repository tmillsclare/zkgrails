package zk

import org.zkoss.zkgrails.GrailsComposer

class Issue146_4Composer extends GrailsComposer {
    def strZscript
    def lblZscriptWireResult

    void onClick_btnTestWiring() {
        if(strZscript == 'hi from zscript') {
            strZscript = 'zscript wired'
            lblZscriptWireResult.value = strZscript
        } else {
            lblZscriptWireResult.value = 'skipped wiring'
        }
    }
}