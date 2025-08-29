package org.firstinspires.ftc.teamcode.teleops;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.arcrobotics.ftclib.command.button.GamepadButton;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.commands.CloseClawCommand;
import org.firstinspires.ftc.teamcode.commands.OpenClawCommand;
import org.firstinspires.ftc.teamcode.commands.ToggleClawCommand;
import org.firstinspires.ftc.teamcode.subsystems.ClawSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.DriveTrainSubsystem;
import org.firstinspires.ftc.teamcode.commands.DriveWithJoysticksCommand;

@TeleOp(name = "Cmd Based TeleOp")

public class TeleOpCmdMode extends CommandOpMode {

    private DriveTrainSubsystem driveTrainSubsystem;
    private ClawSubsystem clawSubsystem;
    private GamepadEx gamepadEx1;



    @Override
    public void initialize() {
        // Initialize drivetrain subsystem
        driveTrainSubsystem = new DriveTrainSubsystem(hardwareMap);
        register(driveTrainSubsystem);

        // Set default command: drive with gamepad1 joysticks
        driveTrainSubsystem.setDefaultCommand(new DriveWithJoysticksCommand(
                driveTrainSubsystem,
                () -> -gamepad1.left_stick_y,  // forward/back
                () -> gamepad1.left_stick_x,   // strafe left/right
                () -> gamepad1.right_stick_x   // rotation
        ));
//*****************************************************************************************
        clawSubsystem = new ClawSubsystem(hardwareMap);
        register(clawSubsystem);

        gamepadEx1 = new GamepadEx(gamepad1);

        // Bind buttons
        new GamepadButton(gamepadEx1, GamepadKeys.Button.A)
                .whenPressed(new ToggleClawCommand(clawSubsystem));

        new GamepadButton(gamepadEx1, GamepadKeys.Button.B)
                .whenPressed(new OpenClawCommand(clawSubsystem));

        new GamepadButton(gamepadEx1, GamepadKeys.Button.X)
                .whenPressed(new CloseClawCommand(clawSubsystem));
//******************************************************************************************




        // Optional: add telemetry
        telemetry.addData("Status", "Initialized");
        telemetry.update();
    }
}

// === EXTRA TEACHING EXAMPLES ===
// Bind right trigger (pressed past 50%) to open claw
// new GamepadButton(driverGamepad, GamepadKeys.Trigger.RIGHT_TRIGGER)
//         .whenPressed(new OpenClawCommand(clawSubsystem));

// Bind left trigger (pressed past 50%) to close claw
// new GamepadButton(driverGamepad, GamepadKeys.Trigger.LEFT_TRIGGER)
//         .whenPressed(new CloseClawCommand(clawSubsystem));

// Bind D-pad up to open claw
// new GamepadButton(driverGamepad, GamepadKeys.Button.DPAD_UP)
//         .whenPressed(new OpenClawCommand(clawSubsystem));

// Bind D-pad down to close claw
// new GamepadButton(driverGamepad, GamepadKeys.Button.DPAD_DOWN)
//         .whenPressed(new CloseClawCommand(clawSubsystem));



