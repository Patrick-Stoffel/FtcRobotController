package org.firstinspires.ftc.teamcode.zz_templates;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * =========================================================
 *  TEMPLATE ONLY — COPY & RENAME BEFORE USING
 * =========================================================
 * How to use:
 * 1. Copy into your teleop or autonomous package.
 * 2. Rename the class and update the @TeleOp/@Autonomous annotation.
 * 3. Instantiate subsystems and commands in initialize().
 * 4. Bind gamepad buttons to commands in initialize().
 * 5. The scheduler runs automatically — no while loop needed.
 */
@TeleOp(name = "Blank CommandOpMode")
public class BlankCommandOpModeTemplate extends CommandOpMode {

    // === Declare subsystems here ===
    // private ExampleSubsystem exampleSubsystem;

    // === Declare commands here ===
    // private ExampleCommand exampleCommand;

    @Override
    public void initialize() {
        telemetry.addLine("Initializing...");
        telemetry.update();

        // === Instantiate subsystems ===
        // exampleSubsystem = new ExampleSubsystem(hardwareMap);

        // === Instantiate commands ===
        // exampleCommand = new ExampleCommand(exampleSubsystem);

        // === Bind gamepad buttons to commands ===
        // gamepadEx1.a().whenPressed(exampleCommand);

        // === Set default commands ===
        // exampleSubsystem.setDefaultCommand(new ExampleDefaultCommand(exampleSubsystem));

        telemetry.addLine("Ready — press START");
        telemetry.update();
    }
}