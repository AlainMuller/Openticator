package com.arturogutierrez.openticator.domain.account.list.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.arturogutierrez.openticator.R;

public class CountdownWidget extends View {

  private Paint paint;
  private RectF bounds;
  private int color;

  public CountdownWidget(Context context) {
    super(context);

    initialize(context, null);
  }

  public CountdownWidget(Context context, AttributeSet attrs) {
    super(context, attrs);

    initialize(context, attrs);
  }

  private void initialize(Context context, AttributeSet attrs) {
    if (attrs != null) {
      TypedArray typedArray =
          context.obtainStyledAttributes(attrs, R.styleable.CountdownWidget, 0, 0);
      try {
        color = typedArray.getColor(R.styleable.CountdownWidget_arcColor, Color.BLACK);
      } finally {
        typedArray.recycle();
      }
    }

    bounds = new RectF(0, 0, getWidth(), getHeight());
    paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    paint.setColor(color);
  }

  @Override
  protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    bounds.set(0, 0, w, h);
    super.onSizeChanged(w, h, oldw, oldh);
  }

  @Override
  protected void onDraw(final Canvas canvas) {
    canvas.drawArc(bounds, 0, 270, true, paint);
  }
}
