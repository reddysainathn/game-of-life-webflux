package com.github.mszarlinski.kata.gameoflife

import com.githum.mszarlinski.kata.gameoflife.Grid
import groovy.transform.CompileStatic

import static com.githum.mszarlinski.kata.gameoflife.Grid.Coord

@CompileStatic
class SampleGrid {

    static O = true
    static X = false

    static Grid aGrid(List<List<Boolean>> cells) {
        Grid grid = new Grid(cells[0].size(), cells.size())
        for (i in 0..<cells.size()) {
            for (j in 0..<cells[i].size()) {
                grid.setCellAt(Coord.of(i, j), cells[i][j])
            }
        }
        return grid
    }
}
