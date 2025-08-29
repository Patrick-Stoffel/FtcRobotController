package org.firstinspires.ftc.teamcode.commands;

import com.arcrobotics.ftclib.command.CommandBase;
import org.firstinspires.ftc.teamcode.subsystems.ClawSubsystem;

public class OpenClawCommand extends CommandBase {

    private final ClawSubsystem clawSubsystem;

    public OpenClawCommand(ClawSubsystem clawSubsystem) {

        this.clawSubsystem = clawSubsystem;
        addRequirements(clawSubsystem);
    }

    @Override
    public void initialize() {
        // Runs once when the command is scheduled
        clawSubsystem.setClawOpen(true);
    }

    @Override
    public void execute() {
        // No repeated action needed — claw is already set open
    }

    @Override
    public void end(boolean interrupted) {
        // Runs once when the command ends or is interrupted
        // Optional: add telemetry or logging here
    }


    @Override
    public boolean isFinished() {
        return true; // Command is done as soon as it's initialized
    }
}