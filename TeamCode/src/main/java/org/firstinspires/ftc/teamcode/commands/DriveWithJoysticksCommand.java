package org.firstinspires.ftc.teamcode.commands;

import com.arcrobotics.ftclib.command.CommandBase;
import org.firstinspires.ftc.teamcode.subsystems.DriveTrainSubsystem;

import java.util.function.DoubleSupplier;

/**
 * Command to drive a mecanum robot using joystick input.
 */
public class DriveWithJoysticksCommand extends CommandBase {

    private final DriveTrainSubsystem driveTrainSubsystem;
    private final DoubleSupplier forward, strafe, turn;

    /**
     * @param driveTrainSubsystem The drivetrain subsystem
     * @param forward             Supplier for forward/back joystick (-1 to 1)
     * @param strafe              Supplier for left/right joystick (-1 to 1)
     * @param turn                Supplier for rotation joystick (-1 to 1)
     */
    public DriveWithJoysticksCommand(DriveTrainSubsystem driveTrainSubsystem,
                                     DoubleSupplier forward,
                                     DoubleSupplier strafe,
                                     DoubleSupplier turn) {
        this.driveTrainSubsystem = driveTrainSubsystem;
        this.forward = forward;
        this.strafe = strafe;
        this.turn = turn;

        // Declare subsystem requirement
        addRequirements(driveTrainSubsystem);
    }

    @Override
    public void execute() {
        driveTrainSubsystem.driveWithJoysticks(
                forward.getAsDouble(),
                strafe.getAsDouble(),
                turn.getAsDouble()
        );
    }

    @Override
    public void end(boolean interrupted) {
        // Stop motors when command ends or is interrupted
        driveTrainSubsystem.stop();
    }
}

