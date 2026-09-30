package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.PS4Controller.Button;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.commands.EditableIntakeVelocity;
import frc.robot.commands.EditableShooterVelocity;
/*import frc.robot.commands.S1F;
import frc.robot.commands.S2F;
import frc.robot.commands.S3F;*/
import frc.robot.commands.OffShooter;
import frc.robot.commands.OnShooter;
import frc.robot.commands.OnShooter2;
import frc.robot.commands.OnShooter3;
/*import frc.robot.commands.S1B;
import frc.robot.commands.S2B;
import frc.robot.commands.S3B;*/
import frc.robot.resources.TecbotConstants;
import frc.robot.subsystems.Intake;

public class OI {
    public static OI instance;
    private static CommandXboxController pilot;
    public static Intake intake;

    public OI(){
        intake = new Intake();
        pilot = new CommandXboxController(0);
    }

    public void configureButtonBindings(){
        pilot.a().whileTrue(new OnShooter2());
        pilot.b().whileTrue(new OffShooter());
        pilot.x().whileTrue(new OnShooter3());
        pilot.y().whileTrue(new OnShooter());
        pilot.rightBumper().whileTrue(new EditableShooterVelocity());


        /*pilot.whenPressed(ButtonType.LB, new S3F());
        pilot.whenPressed(ButtonType.POV_UP, new S3B());*/
      


    }
}
