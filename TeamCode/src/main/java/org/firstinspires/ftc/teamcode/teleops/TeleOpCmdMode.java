package org.firstinspires.ftc.teamcode.teleops;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.subsystems.DriveTrainSubsystem;
import org.firstinspires.ftc.teamcode.commands.DriveWithJoysticksCommand;

@TeleOp(name = "Cmd Based TeleOp")

public class TeleOpCmdMode extends CommandOpMode {

    private DriveTrainSubsystem driveTrainSubsystem;

    @Override
    public void initialize() {
        // Initialize drivetrain subsystem
        driveTrainSubsystem = new DriveTrainSubsystem(hardwareMap);

        // Set default command: drive with gamepad1 joysticks
        register(driveTrainSubsystem);
        driveTrainSubsystem.setDefaultCommand(new DriveWithJoysticksCommand(
                driveTrainSubsystem,
                () -> -gamepad1.left_stick_y,  // forward/back
                () -> gamepad1.left_stick_x,   // strafe left/right
                () -> gamepad1.right_stick_x   // rotation
        ));

        // Optional: add telemetry
        telemetry.addData("Status", "Initialized");
        telemetry.update();
    }
}

