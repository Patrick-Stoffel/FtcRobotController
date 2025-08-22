package org.firstinspires.ftc.teamcode.subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class DriveTrainSubsystem extends SubsystemBase {
    private final DcMotorEx frontLeft, frontRight, backLeft, backRight;

    public DriveTrainSubsystem(HardwareMap hardwareMap) {
        frontLeft = hardwareMap.get(DcMotorEx.class, "frontLeft");
        frontRight = hardwareMap.get(DcMotorEx.class, "frontRight");
        backLeft = hardwareMap.get(DcMotorEx.class, "backLeft");
        backRight = hardwareMap.get(DcMotorEx.class, "backRight");

        frontLeft.setDirection(DcMotorEx.Direction.REVERSE);
        backLeft.setDirection(DcMotorEx.Direction.REVERSE);

        frontLeft.setZeroPowerBehavior(DcMotorEx.ZeroPowerBehavior.BRAKE);
        frontRight.setZeroPowerBehavior(DcMotorEx.ZeroPowerBehavior.BRAKE);
        backLeft.setZeroPowerBehavior(DcMotorEx.ZeroPowerBehavior.BRAKE);
        backRight.setZeroPowerBehavior(DcMotorEx.ZeroPowerBehavior.BRAKE);
    }
    public void driveWithJoysticks(double forward, double strafe, double turn) {
        // Square each input for finer control at low speeds
        forward = squareInput(forward);
        strafe  = squareInput(strafe);
        turn    = squareInput(turn);

        // Calculate raw wheel powers
        double flPower = forward + strafe + turn;  // Front Left
        double frPower = forward - strafe - turn;  // Front Right
        double blPower = forward - strafe + turn;  // Back Left
        double brPower = forward + strafe - turn;  // Back Right

        // Normalize so no value exceeds 1.0
        double max = Math.max(1.0,
                Math.max(Math.abs(flPower), Math.abs(frPower)));
        max = Math.max(max, Math.max(Math.abs(blPower), Math.abs(brPower)));

        frontLeft.setPower(flPower / max);
        frontRight.setPower(frPower / max);
        backLeft.setPower(blPower / max);
        backRight.setPower(brPower / max);
    }

    private double squareInput(double value) {
        return Math.copySign(value * value, value);

    }

        // Placeholder for RoadRunner integration later
    public void setMotorPowers(double fl, double fr, double bl, double br) {
        frontLeft.setPower(fl);
        frontRight.setPower(fr);
        backLeft.setPower(bl);
        backRight.setPower(br);
    }

    @Override
    public void periodic() {
        // Optional: add telemetry or pose updates here
    }
}

