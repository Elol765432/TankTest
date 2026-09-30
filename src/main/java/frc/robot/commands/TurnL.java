package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Robot;

public class TurnL extends Command {
    public TurnL(){

    }

    @Override
    public void initialize(){

    }

    @Override
    public void execute(){
        Robot.getRobotContainer().getDriveTrain().turnL();
    }

    @Override
    public void end(boolean interrupted) {}

    @Override
    public boolean isFinished(){
        return true;
    }
}
