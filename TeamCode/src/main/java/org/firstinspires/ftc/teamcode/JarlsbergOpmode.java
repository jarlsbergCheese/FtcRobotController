package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

@TeleOp(name="jarlsberg")
public class JarlsbergOpmode extends OpMode {

    private DcMotorEx leftFront = null;
    private DcMotorEx rightFront = null;
    private DcMotorEx leftBack = null;
    private DcMotorEx rightBack = null;

    @Override
    public void init() {

        leftFront = hardwareMap.get(DcMotorEx.class, "leftFront");
        rightFront = hardwareMap.get(DcMotorEx.class, "rightFront");
        leftBack = hardwareMap.get(DcMotorEx.class, "leftRear");
        rightBack = hardwareMap.get(DcMotorEx.class, "rightRear");

    }

    @Override
    public void loop() {

          float x = -gamepad1.left_stick_y;
          float y = gamepad1.left_stick_x;

          float rx = gamepad1.right_stick_x;

          leftFront.setPower(y+x);
          rightFront.setPower(y-x);
          leftBack.setPower(y-x);
          rightBack.setPower(y+x);
    }

}
