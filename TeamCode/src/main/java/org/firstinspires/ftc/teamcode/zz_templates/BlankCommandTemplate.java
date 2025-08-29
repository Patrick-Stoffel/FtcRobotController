package org.firstinspires.ftc.teamcode.zz_templates;

import com.arcrobotics.ftclib.command.CommandBase;

/**
 * =========================================================
 *  TEMPLATE ONLY — COPY & RENAME BEFORE USING
 * =========================================================
 * How to use:
 * 1. Copy this file into the correct package (e.g., commands/claw).
 * 2. Rename the class and file to match your command's purpose.
 * 3. Replace "ExampleSubsystem" with the subsystem you need.
 * 4. Fill in the logic inside initialize(), execute(), end(), and isFinished().
 *
 * Command Lifecycle:
 *  - initialize(): runs ONCE when the command is scheduled.
 *  - execute(): runs REPEATEDLY while the command is active.
 *  - end(): runs ONCE when the command finishes or is interrupted.
 *  - isFinished(): tells the scheduler when to stop running this command.
 */
public class BlankCommandTemplate extends CommandBase {

    // === Subsystem references and fields go here ===
    // private final ExampleSubsystem exampleSubsystem;

    /**
     * Constructor — pass in the subsystem(s) this command will use.
     * Always call addRequirements() so the scheduler knows about conflicts.
     */
    public BlankCommandTemplate(/* ExampleSubsystem exampleSubsystem */) {
        // this.exampleSubsystem = exampleSubsystem;
        // addRequirements(exampleSubsystem);
    }

    @Override
    public void initialize() {
        // Runs ONCE when the command starts.
        // Example: reset timers, set initial motor power, move servo to start position.
        // telemetry.addLine("Command started");
    }

    @Override
    public void execute() {
        // Runs repeatedly (every ~20ms) while the command is scheduled.
        // Example: keep driving forward, keep adjusting arm position, run PID loop.
        // telemetry.addData("Motor Power", exampleSubsystem.getMotorPower());
    }

    @Override
    public void end(boolean interrupted) {
        // Runs ONCE when the command ends (either naturally or via cancel/interruption).
        // Example: stop motors, release resources, log final state.
        // telemetry.addLine(interrupted ? "Command interrupted" : "Command finished");
    }

    @Override
    public boolean isFinished() {
        // Return true when the command should end.
        // Example: return true when a sensor detects target, or a timer expires.
        return false; // false = keep running until interrupted
    }
}