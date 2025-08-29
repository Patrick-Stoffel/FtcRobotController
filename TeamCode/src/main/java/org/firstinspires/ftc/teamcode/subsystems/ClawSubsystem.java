package org.firstinspires.ftc.teamcode.subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class ClawSubsystem extends SubsystemBase {

    private final Servo clawServo;
    private boolean clawOpen = false;  // Probably holding game piece to start
    // private CRServo intakeCRServo;

    public static final double OPEN_CLAW_POS = 0.8;
    public static final double CLOSED_CLAW_POS = 0.2;

    public ClawSubsystem(HardwareMap hwMap) {
        clawServo = hwMap.get(Servo.class, "claw_servo");
        // intakeCRServo = hwMap.get(CRServo.class, "intake_servo");
        setClawServoPos(CLOSED_CLAW_POS); // start closed on Init
    }

    /** Sets the claw servo position safely between 0.0 and 1.0 */
    public void setClawServoPos(double servoPos) {
        clawServo.setPosition(Math.max(0.0, Math.min(1.0, servoPos)));
    }

    /** Explicitly sets claw open or closed */
    public void setClawOpen(boolean open) {
        clawOpen = open;
        setClawServoPos(open ? OPEN_CLAW_POS : CLOSED_CLAW_POS);
    }

    /** Toggles the claw between open and closed states */
    public void toggleClaw() {
        setClawOpen(!clawOpen);
    }

    /** Returns true if the claw is open */
    public boolean isClawOpen() {
        return clawOpen;
    }

    /** Returns "OPEN" or "CLOSED" for telemetry */
    public String getClawStateString() {
        return clawOpen ? "OPEN" : "CLOSED";
    }

    // public void setIntakeServoPower(double power) {
    //     intakeCRServo.setPower(power);
    // }
}