package org.firstinspires.ftc.teamcode.opmodes;
import com.arcrobotics.ftclib.command.CommandOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.commands.DriveWithJoysticksCommand;
import org.firstinspires.ftc.teamcode.subsystems.DriveTrainSubsystem;


@TeleOp
public class TeleOpCmdOpMode extends CommandOpMode {

        private  DriveTrainSubsystem driveTrainSubsystem;

        @Override
        public void initialize() {
            driveTrainSubsystem = new DriveTrainSubsystem(hardwareMap);

            driveTrainSubsystem.setDefaultCommand(
                    new DriveWithJoysticksCommand(driveTrainSubsystem, gamepad1)
            );

            telemetry.addLine("DriveTrain Ready");
            telemetry.update();
        }

}
