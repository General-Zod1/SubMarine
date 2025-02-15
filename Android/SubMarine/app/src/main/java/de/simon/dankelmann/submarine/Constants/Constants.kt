package de.simon.dankelmann.submarine.Constants

class Constants {
    companion object {
        val BLUETOOTH_COMMAND_HEADER_LENGTH = 8
        val CC1101_ADAPTER_CONFIGURATION_LENGTH = 30

        val EOL_CHAR:String = "\n"

        // COMMAND IDS
        var COMMAND_ID_DUMMY = "0000"

        // COMMANDS
        var COMMAND_REPLAY_SIGNAL_FROM_BLUETOOTH_COMMAND = "0001"
        var COMMAND_SET_OPERATION_MODE = "0002"
        var COMMAND_SEND_SIGNAL = "0003"
        var COMMAND_SET_ADAPTER_CONFIGURATION = "0004"
        var COMMAND_GET_ADAPTER_CONFIGURATION = "0005"
        var COMMAND_DETECTED_FREQUENCY = "0006"

        // OPERATION MODES
        var OPERATIONMODE_IDLE = "0000"
        var OPERATIONMODE_HANDLE_INCOMING_BLUETOOTH_COMMAND = "0001"
        var OPERATIONMODE_PERISCOPE = "0002"
        var OPERATIONMODE_RECORD_SIGNAL = "0003"
        var OPERATIONMODE_DETECT_SIGNAL = "0004"

        // OTHER
        var MIN_TIMINGS_TO_SAVE = 50

    }
}