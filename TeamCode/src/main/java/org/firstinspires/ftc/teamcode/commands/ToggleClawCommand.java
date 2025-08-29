package org.firstinspires.ftc.teamcode.commands;

import com.arcrobotics.ftclib.command.CommandBase;
import org.firstinspires.ftc.teamcode.subsystems.ClawSubsystem;

/**
 * Command to toggle the claw between open and closed states.
 * Uses the full CommandBase lifecycle for teaching clarity.
 */
public class ToggleClawCommand extends CommandBase {

    private final ClawSubsystem clawSubsystem;

    /**
     * Creates a new ToggleClawCommand.
     * @param clawSubsystem the subsystem used by this command
     */
    public ToggleClawCommand(ClawSubsystem clawSubsystem) {
        this.clawSubsystem = clawSubsystem;
        addRequirements(clawSubsystem); // prevent other commands from using the claw at the same time
    }

    @Override
    public void initialize() {
        // Runs once when the command is scheduled
        clawSubsystem.toggleClaw();
    }

    @Override
    public void execute() {
        // No repeated action needed — toggle happens instantly
    }

    @Override
    public void end(boolean interrupted) {
        // Runs once when the command ends or is interrupted
        // Optional: add telemetry or logging here
    }

    @Override
    public boolean isFinished() {
        // Ends immediately after initialize()
        return true;
    }
}