/*
 * Copyright (C) 2022 Cody L. Wellman All rights reserved. This work is
 * licensed under the terms of the MIT license which can be found in the
 * root directory of this project.
 */

package xyz.zagdrath.lime

import edu.wpi.first.networktables.NetworkTable
import edu.wpi.first.networktables.NetworkTableEntry
import edu.wpi.first.networktables.NetworkTableInstance

class LimeTable(tableName: String) {
    var tableInstance: NetworkTableInstance
    var networkTable: NetworkTable

    var validTarget: NetworkTableEntry
    var targetX: NetworkTableEntry
    var targetY: NetworkTableEntry
    var targetArea: NetworkTableEntry
    var targetSkew: NetworkTableEntry
    var latency: NetworkTableEntry

    var shortSideLength: NetworkTableEntry
    var longSideLength: NetworkTableEntry
    var horizSideLength: NetworkTableEntry
    var vertSideLength: NetworkTableEntry

    var xCorners: NetworkTableEntry
    var yCorners: NetworkTableEntry

    var solve3D: NetworkTableEntry
    var ledMode: NetworkTableEntry
    var cameraMode: NetworkTableEntry
    var pipeline: NetworkTableEntry
    var getPipeline: NetworkTableEntry
    var cameraStream: NetworkTableEntry
    var snapshotMode: NetworkTableEntry

    var timingEntry: NetworkTableEntry

    init {
        tableInstance = NetworkTableInstance.getDefault()
        networkTable = tableInstance.getTable(tableName)

        validTarget = tableInstance.getEntry("tv")
        targetX = tableInstance.getEntry("tx")
        targetY = tableInstance.getEntry("ty")
        targetArea = tableInstance.getEntry("ta")
        targetSkew = tableInstance.getEntry("ts")
        latency = tableInstance.getEntry("tl")

        shortSideLength = tableInstance.getEntry("tshort")
        longSideLength = tableInstance.getEntry("tlong")
        horizSideLength = tableInstance.getEntry("thor")
        vertSideLength = tableInstance.getEntry("tvert")

        xCorners = tableInstance.getEntry("tcornx")
        yCorners = tableInstance.getEntry("tcorny")

        solve3D = tableInstance.getEntry("camtran")
        ledMode = tableInstance.getEntry("ledMode")
        cameraMode = tableInstance.getEntry("camMode")
        pipeline = tableInstance.getEntry("pipeline")
        getPipeline = tableInstance.getEntry("getpipe")
        cameraStream = tableInstance.getEntry("stream")
        snapshotMode = tableInstance.getEntry("snapshot")

        timingEntry = tableInstance.getEntry(".timing_data")
    }

    constructor() : this("limelight") {}

    fun getEntry(key: String): NetworkTableEntry {
        return networkTable.getEntry(key)
    }
}
