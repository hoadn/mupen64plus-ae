/**
 * Mupen64PlusAE, an N64 emulator for the Android platform
 * 
 * Copyright (C) 2012 Paul Lamb
 * 
 * This file is part of Mupen64PlusAE.
 * 
 * Mupen64PlusAE is free software: you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 * 
 * Mupen64PlusAE is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * 
 * See the GNU General Public License for more details. You should have received a copy of the GNU
 * General Public License along with Mupen64PlusAE. If not, see <http://www.gnu.org/licenses/>.
 * 
 * Authors: paulscode, littleguy77
 */
package paulscode.android.mupen64plusae.input;

import paulscode.android.mupen64plusae.GameActivityCommon;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

public class SensorTranslator extends InputTranslator implements SensorEventListener
{
    public void onAccuracyChanged( Sensor sensor, int accuracy )
    {
        // TODO Auto-generated method stub
        
    }
    
    public void onSensorChanged( SensorEvent event )
    {
        if( event.sensor.getType() == Sensor.TYPE_ACCELEROMETER )
        {
            GameActivityCommon.onNativeAccel( event.values[0], event.values[1], event.values[2] );
        }
    }
}
