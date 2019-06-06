package com.luxoft.blockchainlab.hyperledger.indy.utils

import org.apache.commons.io.FileUtils
import org.apache.commons.io.FileUtils.getUserDirectoryPath


internal object EnvironmentUtils {
    val testPoolIP: String
        get() {
            val testPoolIp = System.getenv("TEST_POOL_IP")
            return testPoolIp ?: "127.0.0.1"
        }

    fun getIndyHomePath(): String {
        return getUserDirectoryPath() + "/.indy_client/"
    }

    fun getIndyHomePath(filename: String): String {
        return getIndyHomePath() + filename
    }

    internal fun getTmpPath(): String {
        return FileUtils.getTempDirectoryPath() + "/indy/"
    }

    internal fun getTmpPath(filename: String): String {
        return getTmpPath() + filename
    }
}
