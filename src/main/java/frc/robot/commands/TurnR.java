package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Robot;

public class TurnR extends Command {
    public TurnR(){

    }

    @Override
    public void initialize(){

    }

    @Override
    public void execute(){
        Robot.getRobotContainer().getDriveTrain().turnR();
    }

    @Override
    public void end(boolean interrupted) {}

    @Override
    public boolean isFinished(){
        return true;
    }
}

