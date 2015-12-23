/*
 * LSD - Libre Side-scroller Designer
 * Copyright (C) 2015 Delwink, LLC
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, version 3 only.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.delwink.lsd;

import javax.swing.JFrame;

/**
 * The main LSD window.
 * @author David McMackins II
 */
public class MainFrame extends JFrame {
    public MainFrame() {
        super();
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setSize(800, 600);
        this.show();
    }
    
    public static void main(String[] args) {
        new MainFrame();
    }
}
