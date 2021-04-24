package com.teamXXXX.robot.subsystems

import com.bpsrobotics.engine.odometry.DifferentialDrivePoseProvider
import com.bpsrobotics.engine.odometry.PoseProvider
import com.bpsrobotics.engine.utils.NAVX
import com.kauailabs.navx.frc.AHRS
import edu.wpi.first.wpilibj.ADXRS450_Gyro
import edu.wpi.first.wpilibj.geometry.Pose2d

object Odometry {
    val gyro = NAVX()
    val odometry: PoseProvider = DifferentialDrivePoseProvider(gyro, Drivetrain.leftEncoder, Drivetrain.rightEncoder)

    fun pose(): Pose2d {
        return odometry.pose
    }
}