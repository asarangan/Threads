package com.example.threads

class MyTask {
    private val myManager: MyManager = MyManager.getInstance()

    fun handleDecodeState(state: Int) {
        // Converts the decode state to the overall state.
        val outState: Int = when(state) {
            MyRunnable.DECODE_STATE_COMPLETED -> MyManager.TASK_COMPLETE
        }
        // Calls the generalized state method
        handleState(outState)
    }

    // Passes the state to PhotoManager
    private fun handleState(state: Int) {
        /*
         * Passes a handle to this task and the
         * current state to the class that created
         * the thread pools
         */
        MyManager.handleState(this, state)
    }
}