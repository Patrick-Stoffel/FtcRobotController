package org.firstinspires.ftc.teamcode.commands;
import com.arcrobotics.ftclib.command.CommandBase;
import com.qualcomm.robotcore.hardware.Gamepad;
import org.firstinspires.ftc.teamcode.subsystems.DriveTrainSubsystem;

public class DriveWithJoysticksCommand extends CommandBase {
    private final DriveTrainSubsystem driveTrainSubsystem;
    private final Gamepad gamepad;

    public DriveWithJoysticksCommand(DriveTrainSubsystem driveTrainSubsystem, Gamepad gamepad) {
        this.driveTrainSubsystem = driveTrainSubsystem;
        this.gamepad = gamepad;
        addRequirements(driveTrainSubsystem);
    }
    @Override
    public void execute() {
        double forward = -gamepad.left_stick_y;  // Forward/back
        double strafe  = gamepad.left_stick_x;   // Left/right
        double turn    = gamepad.right_stick_x;  // Rotation

        driveTrainSubsystem.driveWithJoysticks(forward, strafe, turn);
    }
}
