/*
 * @(#)Enums.kt
 *
 * Copyright (C) 2022 Cody L. Wellman All rights reserved. This work is
 * licensed under the terms of the MIT license which can be found in the
 * root directory of this project.
 *
 * Author: Cody L. Wellman <cody@codexmicro.systems>
 *
 * Created: July 21, 2022
 * Updated: July 21, 2022
 */

package xyz.zagdrath.lime.util

enum class LEDMode(value: Int) {
    PIPELINE(0),
    OFF(1),
    BLINK(2),
    ON(3);

    private var value: Int

    init {
        this.value = value
    }

    fun getValue(): Int {
        return value
    }
}

enum class CameraMode(value: Int) {
    VISION(0),
    DRIVER(1);

    private var value: Int

    init {
        this.value = value
    }

    fun getValue(): Int {
        return value
    }
}

enum class SnapshotMode(value: Int) {
    RESET(0),
    ONE(1);

    private var value: Int

    init {
        this.value = value
    }

    fun getValue(): Int {
        return value
    }
}

enum class CameraStream(value: Int) {
    STANDARD(0),
    MAIN(1),
    SECONDARY(2);

    private var value: Int

    init {
        this.value = value
    }

    fun getValue(): Int {
        return value
    }
}

enum class Pipeline(value: Int) {
    INVALID_PIPELINE(-1),
    PIPELINE_0(0),
    PIPELINE_1(1),
    PIPELINE_2(2),
    PIPELINE_3(3),
    PIPELINE_4(4),
    PIPELINE_5(5),
    PIPELINE_6(6),
    PIPELINE_7(7),
    PIPELINE_8(8),
    PIPELINE_9(9);

    private var value: Int

    init {
        this.value = value
    }

    fun getValue(): Int {
        return value
    }
}
