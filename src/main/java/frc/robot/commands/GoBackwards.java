package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Robot;

public class GoBackwards extends Command {
    public GoBackwards(){

    }

    @Override
    public void initialize(){

    }

    @Override
    public void execute(){
        Robot.getRobotContainer().getDriveTrain().goBacwards();
    }

    @Override
    public void end(boolean interrupted) {}

    @Override
    public boolean isFinished(){
        return true;
    }
}

