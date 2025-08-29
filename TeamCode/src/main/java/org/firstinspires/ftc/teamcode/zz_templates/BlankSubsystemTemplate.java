package org.firstinspires.ftc.teamcode.zz_templates;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * =========================================================
 *  TEMPLATE ONLY — COPY & RENAME BEFORE USING
 * =========================================================
 * How to use:
 * 1. Copy this file into the subsystems package.
 * 2. Rename the class and file to match your subsystem.
 * 3. Replace placeholder hardware with real devices.
 * 4. Add public methods to control the hardware.
 * 5. Use telemetry or state tracking to support debugging.
 */
public class BlankSubsystemTemplate extends SubsystemBase {

    // === Declare hardware devices here ===
    // private DcMotor exampleMotor;
    // private Servo exampleServo;

    // === Optional: track last commanded state for telemetry ===
    // private double lastServoPosition = 0.0;

    public BlankSubsystemTemplate(HardwareMap hwMap) {
        // === Map hardware devices here ===
        // exampleMotor = hwMap.get(DcMotor.class, "motor_name");
        // exampleServo = hwMap.get(Servo.class, "servo_name");

        // === Optional: set initial state ===
        // exampleMotor.setPower(0);
        // setServoPosition(0.5); // known safe position
    }

    // === Add public methods to control the subsystem ===

    // Example: set motor power safely
    // public void setMotorPower(double power) {
    //     exampleMotor.setPower(Math.max(-1.0, Math.min(1.0, power)));
    // }

    // Example: set servo position with clamping
    // public void setServoPosition(double position) {
    //     position = Math.max(0.0, Math.min(1.0, position));
    //     exampleServo.setPosition(position);
    //     lastServoPosition = position;
    // }

    // === Optional: telemetry or feedback methods ===

    // public double getLastServoPosition() {
    //     return lastServoPosition;
    // }

    // public double getMotorVelocity() {
    //     return exampleMotor.getVelocity();
    // }

    // === Optional: quick self-test for init phase ===
    // public void selfTest() {
    //     setServoPosition(0.5);
    //     // Could add a short delay in a test opmode
    // }
}