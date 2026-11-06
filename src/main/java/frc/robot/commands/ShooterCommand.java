
package frc.robot.commands;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandPS5Controller;

import frc.robot.Constants.OperatorConstants;
import frc.robot.subsystems.DriveSubsystem;




public class ShooterCommand extends Command{


    private final ShooterSubsystem shooterSubsystem;

    private final CommandPS5Controller controller;

    public ShooterCommand(
        ShooterSubsystem subsystem,
        CommandPS5Controller ps5Controller
    ) {
        shooterSubsystem = subsystem;
        controller = ps5Controller;

        addRequirements(shooterSubsystem);
    {

    public void initialize()
    ){}


    public void excecute(){
        talonFX_LEADER.set(ControlMode.PercentOutput, 1.0); //set consant
    }

    public void isFinished(){}

    public void end(){}
    }
}
