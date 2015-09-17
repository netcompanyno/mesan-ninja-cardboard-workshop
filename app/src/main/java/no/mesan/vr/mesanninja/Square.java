package no.mesan.vr.mesanninja;

import android.content.Context;
import android.opengl.GLES20;

/**
 * Created by Thomas on 17.09.2015.
 */
public class Square extends Shape {

    private static final float[] SQUARE_NORMALS = new float[]{
            0.0f, 0.0f, 1.0f,
            0.0f, 0.0f, 1.0f,
            0.0f, 0.0f, 1.0f,
            0.0f, 0.0f, 1.0f,
            0.0f, 0.0f, 1.0f,
            0.0f, 0.0f, 1.0f
    };

    private static final float[] SQUARE_COORDINATES = {
            -2.0f, 2.0f, 2.0f,
            -2.0f, -2.0f, 2.0f,
            2.0f, 2.0f, 2.0f,
            -2.0f, -2.0f, 2.0f,
            2.0f, -2.0f, 2.0f,
            2.0f, 2.0f, 2.0f
    };

    private static final float[] SQUARE_COLORS = {
            0.0f, 0.3398f, 0.9023f, 1.0f,
            0.0f, 0.3398f, 0.9023f, 1.0f,
            0.0f, 0.3398f, 0.9023f, 1.0f,
            0.0f, 0.3398f, 0.9023f, 1.0f,
            0.0f, 0.3398f, 0.9023f, 1.0f,
            0.0f, 0.3398f, 0.9023f, 1.0f,
    };

    public Square(Context context) {
        super(context);
    }

    @Override
    protected int getFragmentShader() {
        return GLUtils.loadGLShader(context, GLES20.GL_FRAGMENT_SHADER, R.raw.triangle_fragment);
    }

    @Override
    protected float[] getShapeCoordinates() {
        return SQUARE_COORDINATES;
    }

    @Override
    protected float[] getShapeColors() {
        return SQUARE_COLORS;
    }

    @Override
    protected float[] getShapeNormals() {
        return SQUARE_NORMALS;
    }
}
